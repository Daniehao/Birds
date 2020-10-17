import java.util.HashMap;
import java.util.Map;

public class Cell {
  //string is the direction
  Map<String, Cell> cellMap;
  boolean hasGold;
  boolean hasThief;

  public Cell() {
    cellMap = new HashMap<>();
    cellMap.put("left", null);
    cellMap.put("right", null);
    cellMap.put("up", null);
    cellMap.put("down", null);
    hasGold = false;
    hasThief = false;
  }

  public void setNextCell(Cell nextCell, String directionSide) {
    switch (directionSide) {
      case "left":
        cellMap.put("left", nextCell);
        break;
      case "right":
        cellMap.put("right", nextCell);
        break;
      case "up":
        cellMap.put("up", nextCell);
        break;
      case "down":
        cellMap.put("down", nextCell);
        break;
    }
  }

  public void setGold() {
    hasGold = true;
  }

  public void setThief() {
    hasThief = true;
  }

  public boolean hasGold() {
    return hasGold;
  }

  public boolean hasThief() {
    return hasThief;
  }
}
