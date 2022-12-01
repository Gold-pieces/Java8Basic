package thread;

public class ExtendThread extends Thread{
    @Override
    public void run() {
        System.out.println("Extend Thread : " + getName()); // 현재 실행 중인 쓰레드의 이름을 반환.

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.println("- Extend Thread End -" );
    }
}
