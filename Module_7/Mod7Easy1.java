package com.Brunoyam.Module_7;

import java.time.LocalDateTime;
public class Mod7Easy1 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.showTime();
    }
}

class Clock {
    public void showTime() {
        System.out.println(LocalDateTime.now());
    }
}
