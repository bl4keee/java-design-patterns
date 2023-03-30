package behavioral_design_patterns.command;

/**
 * @author bl4kee
 * @since 29.03.2023
 */
public class ControlBox {

  public static final int SLIDER_MIN = 0;
  public static final int SLIDER_MAX = 100;

  private int sliderValue;
  private boolean poweredOn;

  public ControlBox() {
    sliderValue = 0;
    poweredOn = false;
  }

  public int getSliderValue() {
    return sliderValue;
  }

  public boolean hasPower() {
    return poweredOn;
  }

  public void powerOn() {
    poweredOn = true;
  }

  public void powerOff() {
    poweredOn = false;
  }

  public void sliderIncrease() {
    if (hasPower()) {
      if (getSliderValue() < SLIDER_MAX) {
        sliderValue++;
        System.out.println(sliderValue);
      }
    }
  }

  public void sliderDecrease() {
    if (hasPower()) {
      if (getSliderValue() > SLIDER_MIN) {
        sliderValue--;
        System.out.println(sliderValue);
      }
    }
  }
}
