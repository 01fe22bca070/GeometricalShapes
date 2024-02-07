public class Calculator{
    /**
     * The function "addition" takes two float operands and returns their sum.
     * 
     * @param operand_1 The first operand for addition. It is a float data type.
     * @param operand_2 The second operand in the addition operation.
     * @return the sum of operand_1 and operand_2.
     */
    float addition(float operand_1,float operand_2){
        return(operand_1 + operand_2);
    }

    /**
     * The function "subtraction" takes two float operands and returns their difference.
     * @param {float} operand_1 - The first operand for subtraction. It is a floating-point number.
     * @param {float} operand_2 - The second operand in the subtraction operation.
     * @returns the result of subtracting operand_2 from operand_1.
     */
    
     float subtraction(float operand_1,float operand_2){
        return(operand_1 - operand_2);
    }

    float multiplication(float operand_1,float operand_2){
        return(operand_1 * operand_2);
    }

    float division(float operand_1,float operand_2){
            return(operand_1 / operand_2);
    }

    float square(float operand_1){
            return(operand_1 * operand_1);
    }
    float cube(float operand_1){
            return(operand_1 *operand_1*operand_1);
    }
  // The `main` method is the entry point of the Java program. It is the method that is executed when
  // the program is run.
    public static void main(String args[]){
        float operand_1 = 10;
        float operand_2 = 5;
        Calculator calc = new Calculator();
        float add_result = calc.addition(operand_1,operand_2);
        System.out.println("javaResult of Addition is :" +add_result);
        float sub_result = calc.subtraction(operand_1, operand_2);
        System.out.println("Result of Subtraction is :"+sub_result);
        float mul_result = calc.multiplication(operand_1, operand_2);
        System.out.println("Result of Multiplication is :" +mul_result);
        float div_result =calc.division(operand_1, operand_2);
        System.out.println(" Resultof Division is :" +div_result);
        float sqr_result =calc.square(operand_1);
        System.out.println(" Resultof Sqaure is :" +sqr_result);
        float cube_result =calc.cube(operand_1);
        System.out.println(" Resultof cube is :" +cube_result);
    



    }

} 