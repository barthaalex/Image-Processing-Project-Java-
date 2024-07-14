class Language {

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
      this.name = name;
      this.numSpeakers = numSpeakers;
      this.regionsSpoken = regionsSpoken;
      this.wordOrder = wordOrder;
    }

    public void getInfo() {
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
      System.out.println("The language follows the word order: " + this.wordOrder + ".\n");
    }

    public String setRegion(String newRegion) {
      this.regionsSpoken = newRegion;
      return regionsSpoken;
    }

    public int changeNumOfSpeakers(int newNumOfSpeakers) {
      this.numSpeakers = newNumOfSpeakers;
      return numSpeakers;
    }

    public String modifyWordOrder(String modifiedOrder) {
      this.wordOrder = modifiedOrder;
      return wordOrder;
    }

class Mayan extends Language {
  Mayan(String name, int numSpeakers) {
    super(name, numSpeakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in Central America.");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.\n");
  }


}

class SinoTibetan extends Language {
  SinoTibetan(String name, int numsSpeakers) {
    super(name, numsSpeakers, "Asia", "subject-object-verb");
    if (this.name.contains("Chinese")) {
      wordOrder = "subject-verb-object";
    }
  }
}

class Afrosiatic extends Language {
  Afrosiatic(String name, int numSpeakers) {
    super(name, numSpeakers, "North Africa", "verb-subject-object");
  }
}

 public static void main(String[] args) {

    Language english, chontal, mandarinChinese, burmese, egyptian;

    english = new Language("English", 1460000000, "Northern America", "subject-verb-object");
    chontal = new Mayan("Chontal", 60000);
    mandarinChinese = new SinoTibetan("Mandarin Chinese", 929000000);
    burmese = new SinoTibetan("Burmese", 43000000);
    egyptian = new Afrosiatic("Egyptian", 102000000);

    Language[] languages = {english, chontal, mandarinChinese, burmese, egyptian};

    for (Language language : languages) {
        language.getInfo();
    }

  }
}