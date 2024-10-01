package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        try {
            byte n=Byte.parseByte(input);
            return "byte";
        } catch (NumberFormatException e) {
            try {
                short n=Short.parseShort(input);
                return "short";
            } catch (NumberFormatException e1) {
                try {
                    int n=Integer.parseInt(input);
                    return "int";
                } catch (NumberFormatException e2) {
                    try {
                        long n=Long.parseLong(input);
                        return "long";
                    } catch (NumberFormatException e3) {
                      return "";
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
