package com.rl;

import cn.tx.ModiferTest4;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
public class ModiferTest4Client extends ModiferTest4{
    public static void main(String[] args) {
        ModiferTest4Client m = new ModiferTest4Client();
        m.publicMethod();
        m.protectedMethod();
       // m.defaultMethod();
       // m.privateMethod();
    }
}
