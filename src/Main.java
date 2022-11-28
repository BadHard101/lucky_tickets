public class Main {
    public static void main(String[] args) {
        int s = 0;
        for (int a1 = 0; a1 < 10; a1++) {
            for (int a2 = 0; a2 < 10; a2++) {
                for (int a3 = 0; a3 < 10; a3++) {
                    for (int b1 = 0; b1 < 10; b1++) {
                        for (int b2 = 0; b2 < 10; b2++) {
                            for (int b3 = 0; b3 < 10; b3++) {
                                if (a1+a2+a3 == b1+b2+b3
                                        && a1!=a2
                                        && a1!=a3
                                        && a1!=b1
                                        && a1!=b2
                                        && a1!=b3
                                        && a2!=a3
                                        && a2!=b1
                                        && a2!=b2
                                        && a2!=b3
                                        && a3!=b1
                                        && a3!=b2
                                        && a3!=b3
                                        && b1!=b2
                                        && b1!=b3
                                        && b2!=b3) {
                                    s++;
                                    System.out.println(
                                            Integer.toString(a1)+
                                            Integer.toString(a2)+
                                            Integer.toString(a3)+
                                            Integer.toString(b1)+
                                            Integer.toString(b2)+
                                            Integer.toString(b3)
                                    );
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(s);
    }
}