public class ItemDrop {

    private int mobId;
    private int itemId;
    private int min;
    private int max;
    private int quest;
    private int shouldStack;
    private int chance;

    public ItemDrop(int mobId, int itemId, int min, int max, int quest, int shouldStack, int chance) {
        this.mobId = mobId;
        this.itemId = itemId;
        this.min = min;
        this.max = max;
        this.quest = quest;
        this.shouldStack = shouldStack;
        this.chance = chance;
    }

    public int getMobId() {
        return mobId;
    }

    public void setMobId(int mobId) {
        this.mobId = mobId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getQuest() {
        return quest;
    }

    public void setQuest(int quest) {
        this.quest = quest;
    }

    public int getShouldStack() {
        return shouldStack;
    }

    public void setShouldStack(int shouldStack) {
        this.shouldStack = shouldStack;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d,%d,%d,%d,%d,%d)",
                mobId,
                itemId,
                min,
                max,
                quest,
                chance,
                shouldStack);
    }

}
