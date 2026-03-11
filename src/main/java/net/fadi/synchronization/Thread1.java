package net.fadi.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Thread1 extends Thread {
    private MathUtil mathUtil;

    @Override
    public void run() {
        mathUtil.getMultiply(5);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ;
    }

}
