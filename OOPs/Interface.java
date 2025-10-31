public class Interface {
  public static void main(String[] args) {
    // Queen q = new Queen();
    // q.moves();

    Bear b = new Bear();
    b.eatGrass();
    b.eatMeet();
  }
}

interface ChessPlayer {
  void moves();
}

class Queen implements ChessPlayer {
  public void moves() {
    System.out.println("up, down, right, left, diagonal (in all 4 diraction)");
  }
}

class Rook implements ChessPlayer {
  public void moves() {
    System.out.println("up, down, right, left");
  }
}

class King implements ChessPlayer {
  public void moves() {
    System.out.println("up, down, right, left, diagonal (by 1 stape)");
  }
}

// Multiple in Inharitance
interface Herbivore {
  void eatGrass();
}

interface Carnivore {
  void eatMeet();
}

class Bear implements Herbivore, Carnivore {
  public void eatGrass() {
    System.out.println("can eat grass!");
  }

  public void eatMeet() {
    System.out.println("can eat meet!");
  }
}