import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String sqlInsert = "INSERT INTO drop_data (dropperid,itemid,minimum_quantity,maximum_quantity,questid,chance,should_stack) VALUES ";
        try (Scanner scanner = new Scanner(new File("book1.csv"))) {
            scanner.nextLine(); // skip titles (mob,item,rate,min,max,quest,unstack)
            while (scanner.hasNextLine()) {
                ItemDrop drop = getItemDropFromLine(scanner.nextLine());
                sqlInsert += "\n" + drop + ", ";
            }
        }
        sqlInsert = sqlInsert.substring(0, sqlInsert.length() - 2) + ";";
        System.out.println(sqlInsert);
    }

    private static ItemDrop getItemDropFromLine(String line) {
        // mob,item,rate,min,max,quest,unstack
        String[] dropLine = line.split(",");
        int mobId = Integer.parseInt(dropLine[0]);
        int itemId = Integer.parseInt(dropLine[1]);
        int min = Integer.parseInt(dropLine[3]);
        int max = Integer.parseInt(dropLine[4]);
        int quest = dropLine[5].equals("yes") ? 1 : 0;
        int shouldStack = dropLine[6].equals("yes") ? 0 : 1; // opposite of unstack
        int chance = 500000 / Integer.parseInt(dropLine[2]);

        return new ItemDrop(mobId, itemId, min, max, quest, shouldStack, chance);
    }

}
