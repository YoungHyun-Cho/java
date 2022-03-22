class Document {
  static int count = 0;
  String name;

  Document(String name) {
    this.name = name + ".txt";
  }

  Document() {
    this.name = "제목없음" + ++count + ".txt";
  }
}

class Example {
  public static void main(String[] args) {
    String[] name = { "OS", "DLG", "DS", "C", "WP", "AL" };
    Document[] doc = new Document[10];
    for (int i = 0; i < doc.length; i++) {
      if (i % 2 == 0) doc[i] = new Document();
      else doc[i] = new Document(name[i % name.length]);
      System.out.printf("%s is created.%n", doc[i].name);
    }
  }
}

