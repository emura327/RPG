import java.util.Random;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthDesktopIconUI;

public class RPG {
    public static void main(String[] args) {
        System.out.println("あなたの名前を教えてください。");
        String name = new java.util.Scanner(System.in).nextLine();
        int i = 0;
        String hero = "勇者";
        int magic = 7;
        int attack = 5;
        int mp = 2;
        String enemy = "スライム";
        int enemyHp = 20;
        int flg = 0;

        while(enemyHp > 0 && i < 6 && flg == 0){
        System.out.println("次に行う行動を数字で入力して下さい");
        System.out.println("1:こうげき");
        System.out.println("2:じゅもん");
        System.out.println("3:にげる");
        int command = new java.util.Scanner(System.in).nextInt();
            
        switch(command){
                case 1:
                System.out.println(hero + name + "の攻撃!!");
                int critical = new java.util.Random().nextInt(5);
                if(critical == 4){
                    System.out.println("会心の一撃!!");
                    enemyHp = enemyHp - attack*2;
                    System.out.println(enemy + ("の残りHPは" + enemyHp));
                    i++;
                }else if(critical == 0){
                    System.out.println(enemy + "によけられてしまった");
                    System.out.println(enemy + ("の残りHPは" + enemyHp));
                    i = i + 2;
                }else{
                    System.out.println(hero + ("が") + enemy + ("を攻撃した！"));
                    enemyHp = enemyHp - attack;
                    System.out.println(enemy + ("の残りHPは" + enemyHp));
                    i++;
                }break;

                case 2:
                System.out.println(hero + name + "の攻撃!!");
                System.out.println(hero + name + "はメラを唱えた!!");
                if(mp > 0){
                    enemyHp = enemyHp - magic;
                    System.out.println(enemy + ("の残りHPは" + enemyHp));
                    mp--;
                    i++;
                }else{
                    System.out.println("しかしmpが足りない‼");
                    i++;
                }break;

                

                case 3:
                int escape = new java.util.Random().nextInt(6);
                if(escape == 5){
                    System.out.println(hero + name + "は逃げた！");
                    flg = 1;
                }else{
                    System.out.println("しかし回り込まれてしまった！");
                    i = i +2;
                }break;
                
            }
            }

            if(flg == 1){
            }else if(enemyHp > 0){
                System.out.println(hero + name + "は"+ enemy + "によって屍になってしまった。");
                System.out.println("お気の毒ですがあなたの冒険の書は消えてしまいました");
            }else{
                System.out.println(hero + name + "は" + enemy + "を倒した！");
            }
        
    }
}
