import java.util.*;

class OneCard {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Deck deck = new Deck();

    System.out.println("One Card Game ========================");
    deck.shuffle();
    
    // 카드 분배
    Card[] player1 = Arrays.copyOfRange(deck.cards, 0, 7);
    Card[] player2 = Arrays.copyOfRange(deck.cards, 7, 14);
    Card[] reserve = Arrays.copyOfRange(deck.cards, 14, 55);

    // 첫 장 뽑기


    // System.out.printf("%d, %d, %d", player1.length, player2.length, reserve.length);
    
    
  }
}

class Deck {
  final int CARD_NUM = Card.KIND_MAX * Card.NUM_MAX + 2; // 2 : Color joker, joker
  Card[] cards = new Card[CARD_NUM];
  
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

