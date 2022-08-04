package ss4_Class_And_Object.exercise.stop_Watch;

public class StopWatch {
    private long starTime;
    private long endTime;
    public StopWatch(){
        this.starTime = System.currentTimeMillis();
    }
    long start(){
      return this.starTime = System.currentTimeMillis();
    }
    long stop(){
        return  this.endTime = System.currentTimeMillis();
    }
    long getStarTime(){
        return this.starTime;
    }
    long getEndTime(){
        return this.endTime;
    }
    public long  getElapsedTime(){
        return  this.endTime - this.starTime;
    }


}
