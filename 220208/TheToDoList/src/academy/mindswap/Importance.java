package academy.mindswap;

public enum Importance {
    HIGH(1),
    MEDIUM(2),
    LOW(3);

    private int importance;

    Importance(int importance) {
        this.importance = importance;
    }

    public int getImportance() {
        return importance;
    }
}

/*public enum MonsterType {
    WEREWOLF("Werewolf"),  //public static final WEREWOLF = new MonsterType("Werewolf");
    MUMMY("Mummy"),
    VAMPIRE("Vampire");

    private String description;

    MonsterType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
*/
