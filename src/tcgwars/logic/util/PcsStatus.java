package tcgwars.logic.util;

import tcgwars.logic.effect.Source;

public class PcsStatus {

  private String description;
  private int duration;
  private Source src;


  public PcsStatus(String description) {
    this(description, -1);
  }

  public PcsStatus(String description, int duration) {
    this(description, duration, null);
  }

  public PcsStatus(String description, int duration, Source src) {
    this.description = description;
    this.duration = duration;
    this.src = src;
  }

  public String getDescription(){
    return description;
  }

  public int getDuration() {
    return duration;
  }

  public Source getSrc() {
    return src;
  }

  public boolean isOver() {
    return duration == 0;
  }

  public void reduceDuration() {
    if (duration > 0) duration--;
    else throw new IllegalStateException("Undetermined length status, or those finalized shouldn't use this method");
  }

  public String getDurationAsString(){
    if (duration < 0) return "Undetermined";
    else switch(duration) {
      case 1:
        return "End of this turn";
      case 2:
        return "End of the next turn";
      default:
        return String.format("%d turns (including this one)", duration);
    }
  }

}
