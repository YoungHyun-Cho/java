import java.util.*;

class OneCard {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Deck deck = new Deck();
    int input = 0;
    while (true) {
      System.out.println("choose action: (1) pick one   (2) shuffle all   (3) exit");
      input = s.nextInt();
      if (input == 1) System.out.printf("%s%n%n", deck.pick().toString());
      else if (input == 2) deck.shuffle();
      else if (input == 3) break;
      else System.out.println("choose correct option");
    }
    System.out.println("bye");
  }
}

class Deck {
  final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX + 2; // 2 : Color joker, joker
  Card[] cards = new Card[CARD_NUM];
  int index = 0;
  
  Deck() {
    int k = 0;
    for (int i = 0; i < Card.KIND_MAX; i++) {
      for (int j = 0; j < Card.NUM_MAX; j++) {
        cards[k++] = new Card(i, j);
      }
    }
    cards[CARD_NUM - 2] = new Card(4, 0);
    cards[CARD_NUM - 1] = new Card(5, 0);
  }

  void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      int r = (int)(Math.random() * CARD_NUM);
      Card temp = cards[i];
      cards[i] = cards[r];
      cards[r] = temp;
    }
  }

  Card pick() {
    return cards[index++ % CARD_NUM];
  }
}

class Card {
  static final int KIND_MAX = 4;
  static final int NUM_MAX  = 13; // A 2 3 4 5 6 7 8 9 10 J Q K
  
  static final int SPADE   = 3;
  static final int DIAMOND = 2;
  static final int HEART   = 1;
  static final int CLOVER  = 0;

  int kind;
  int number;

  Card(int kind, int number) {
    this.number = number;
    this.kind = kind;
  }

  public String toString() {
    String[] kinds = { "CLOVER", "HEART", "DIAMOND", "SPADE", "JOKER", "COLOR JOKER" };
    String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    if (kind > 3) return kinds[kind];
    return kinds[kind] + " " + numbers[number];
  }
}

