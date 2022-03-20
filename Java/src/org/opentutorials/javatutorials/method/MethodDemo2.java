// Method를 통해 더 쉽게(재활용), 코드량이 줄고, 유지보수가 유리해진다.
package org.opentutorials.javatutorials.method;
 
public class MethodDemo2 {
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
    }
}

