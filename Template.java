class Template{
    private int hp;
    private int strength;
    private int dexterity;
    private int constituition;
    private int inteligence;
    private int wisdom;
    private int charisma;
    private int exp;
    private int lv;
    public void setLevel(){
        if(exp>=0&&exp<300)
        lv=1;
        if(exp>=300&&exp<900)
        lv=2;
        if(exp>=900&&exp<2700)
        lv=3;
        if(exp>=2700&&exp<6500)
        lv=4;
        if(exp>=6500&&exp<14000)
        lv=5;
        if(exp>=14000&&exp<23000)
        lv=6;
        if(exp>=23000&&exp<34000)
        lv=7;
        if(exp>=34000&&exp<48000)
        lv=8;
        if(exp>=48000&&exp<64000)
        lv=9;
        if(exp>=64000&&exp<85000)
        lv=10;
        if(exp>=85000&&exp<100000)
        lv=11;
        if(exp>=100000&&exp<120000)
        lv=12;
        if(exp>=120000&&exp<140000)
        lv=13;
        if(exp>=140000&&exp<165000)
        lv=14;
        if(exp>=165000&&exp<195000)
        lv=15;
        if(exp>=195000&&exp<225000)
        lv=16;
        if(exp>=225000&&exp<265000)
        lv=17;
        if(exp>=265000&&exp<305000)
        lv=18;
        if(exp>=305000&&exp<355000)
        lv=19;
        if(exp>=355000)
        lv=20;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return this.dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstituition() {
        return this.constituition;
    }

    public void setConstituition(int constituition) {
        this.constituition = constituition;
    }

    public int getInteligence() {
        return this.inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    public int getWisdom() {
        return this.wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCharisma() {
        return this.charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getExp() {
        return this.exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLv() {
        return this.lv;
    }
}