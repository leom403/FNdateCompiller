/*
Для перевода из 16 в 10 нужно:
каждая 10 часть - это 16 в степени, начиная с 0. 921 = 1*16^0= 1; 2*16^1=2*16; 9*16^2 = 9*256;
потом все эти числа складываются между собой ( 1 + 32 + 2304 )
 */

// вводим breakThePart, которой бьем массив [2](three), что бы получить 2 числа и произввести вычисления
//нужно записать обе числа из получившегося breakThePart в массив.
//      breakThePart3 - год,        breakThePart2 - мес,        breakThePart1 - день,
//В новом вычислении partOne = part[0] * 1 ; partTwo = part[1] * 16
//далее year = partOne + partTwo
//ри переводе чисел, следует помнить, что в шестнадцатеричной системе счисления: A=10; B=11; C=12; D=13; E=14; F=15.
//Мне нужны числа до 12 в мес и до 31 в днях

//// Преобразование шестнадцатеричного символа в десятичное число
//        unsigned int char2int_(char chr)
//        {
//            if (chr >= '0' && chr <= '9')
//                return chr - '0';
//            else if (chr >= 'A' && chr <= 'F')
//                return chr - 'A' + 10;
//            else if (chr >= 'a' && chr <= 'f')
//                return chr - 'a' + 10;
//            return -1;
//        }
//**************
//
//Java's Integer class has a built-in method to parse a hex number (string) into an int:
//
//Integer.valueOf("AB", 16)
// 26-1A; 27-1B;28-1C;29-1D;30-1E;31-1F