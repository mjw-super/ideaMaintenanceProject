package com.idea_xmwh.idea_code.kscfile.threadComm;

/**
 * @Description
 * @ClassName ThreadDemo
 * @Author Mengjw
 * @date 2020.12.18 14:31
 */
public class ThreadDemo1 implements Runnable{
    // 初始化票数10
    private int ticket = 10;

    @Override
    public void run() {
        // 获取当前线程的序号从0开始
        int threadNum = Integer.parseInt(Thread.currentThread().getName().substring(7));
        System.out.println("==》"+threadNum);
        // 偶数线程执行该方法
        if ((threadNum + 1) % 2 == 0) {
            while (true) {
                synchronized (this) {
                    String saleWindowName = "奇数销售窗口" + threadNum;
                    if (ticket > 0) {
                        // 这里为了演示出线程不同步的问题，让线程睡眠一段时间，延时）
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(saleWindowName + " 卖 出 了 " + ticket-- + " 号 票 ！");
                    } else {
                        break;
                    }
                }
            }
        } else {
            // 奇数线程执行该方法
            // 开始买票
            while (true) {
                // 当没有票了结束
                if (!saleSuccess()) {
                    break;
                }
            }
        }

    }

    public synchronized boolean saleSuccess() {
        // 获取线程的名称，比如Thread-0，并将它截掉Thread-取0这个数字标识，为了构造下面卖票窗口名称
        int threadNum = Integer.parseInt(Thread.currentThread().getName().substring(7));
        String saleWindowName = "偶数销售窗口" + threadNum;
        if (ticket > 0) {
            // 这里为了演示出线程不同步的问题，让线程睡眠一段时间，延时）
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(saleWindowName + " 卖 出 了 " + ticket-- + " 号 票 ！");
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // 创建了销售窗口对象
        ThreadDemo1 sw = new ThreadDemo1();
        // 启动线程，让第一个窗口开始买票
        new Thread(sw).start();
        // 启动线程，让第二个窗口开始买票
        new Thread(sw).start();
        // 启动线程，让第三个窗口开始买票
        new Thread(sw).start();
        new Thread(sw).start();

    }

}
