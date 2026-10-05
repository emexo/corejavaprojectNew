package com.emexo.javafeatures.java22;

public class VirtualThreadScopedValue {

    static final ScopedValue<String> REQUEST_ID = ScopedValue.newInstance();

    public static void main(String[] args) {

        ScopedValue.where(REQUEST_ID, "REQ-1001")
                .run(() -> Thread.startVirtualThread(() -> {

                    System.out.println(REQUEST_ID.get()
                    );
                }));
    }
}
