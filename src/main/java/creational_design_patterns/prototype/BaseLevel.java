package creational_design_patterns.prototype;

/**
 * @author bl4kee
 * @since 10.04.2023
 */
public abstract class BaseLevel implements Cloneable {

  public String levelName;
  public int numberOfNPCs;
  public int numberOfTokens;

  public String getLevelName() {
    return levelName;
  }

  public void setLevelName(String levelName) {
    this.levelName = levelName;
  }

  public int getNumberOfNPCs() {
    return numberOfNPCs;
  }

  public void setNumberOfNPCs(int numberOfNPCs) {
    this.numberOfNPCs = numberOfNPCs;
  }

  public int getNumberOfTokens() {
    return numberOfTokens;
  }

  public void setNumberOfTokens(int numberOfTokens) {
    this.numberOfTokens = numberOfTokens;
  }

  @Override
  public BaseLevel clone() {
    try {
      return (BaseLevel) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
