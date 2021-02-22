/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author truongtuan
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand milliSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliSeconds = new ClockHand(100);
    }

    public void advance() {
        this.milliSeconds.advance();

        if (this.milliSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds.toString() + ":" + this.milliSeconds.toString();
    }
}
