package com.kulgeiko.java.gc;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by akulgeiko on 6/26/2018.
 */
public class References {

    public static void main(String... args){

        // Strong
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb = null;

        // Soft
        SoftReference<StringBuilder> sbSoft = new SoftReference<>(sb);
        sbSoft = null;

        // Weak
        WeakReference<StringBuilder> sbWeak = new WeakReference<>(sb);
        sbSoft = null;

        // Phantom
        ReferenceQueue q = new ReferenceQueue();
        PhantomReference<StringBuilder> sbPhantom = new PhantomReference<>(sb, q);
        sbPhantom = null;
    }

}
