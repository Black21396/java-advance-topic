package net.fadi.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Thread2 extends Thread {

    private MathUtil mathUtil;

    @Override
    public void run() {
        mathUtil.getMultiply(2);
    }

}
