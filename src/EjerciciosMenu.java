import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public class EjerciciosMenu {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Menú de Ejercicios:");
                System.out.println("1. Determinar si eres mayor de edad");
                System.out.println("2. Encontrar el número mayor entre dos números");
                System.out.println("3. Verificar si un número es par o impar");
                System.out.println("4. Calcular el factorial de un número");
                System.out.println("5. Mostrar números impares hasta un límite con bucle for");
                System.out.println("6. Mostrar números impares hasta un límite con bucle while");
                System.out.println("7. Dias de la semana con switch");
                System.out.println("8. Salir");

                System.out.print("Selecciona una opción (1-6): ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        verificarMayorEdad(scanner);
                        break;

                    case 2:
                        encontrarNumeroMayor(scanner);
                        break;

                    case 3:
                        verificarParImpar(scanner);
                        break;

                    case 4:
                        calcularFactorial(scanner);
                        break;

                    case 5:
                        mostrarImparesFor(scanner);
                        break;

                    case 6:
                        mostrarImparesWhile(scanner);
                        break;

                    case 7:
                        mostrarDiasSemana(scanner);
                        break;

                    case 8:
                        System.out.println("¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtalo nuevamente.");
                }
            }

            private static void verificarMayorEdad(Scanner scanner) {
                System.out.print("Ingresa tu edad: ");
                int edad = scanner.nextInt();
                if (edad >= 18) {
                    System.out.println("Eres mayor de edad.");
                } else {
                    System.out.println("Eres menor de edad.");
                }
            }

            private static void encontrarNumeroMayor(Scanner scanner) {
                System.out.print("Ingresa el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();
                if (num1 > num2) {
                    System.out.println("El primer número es mayor.");
                } else if (num2 > num1) {
                    System.out.println("El segundo número es mayor.");
                } else {
                    System.out.println("Ambos números son iguales.");
                }
            }

            private static void verificarParImpar(Scanner scanner) {
                System.out.print("Ingresa un número entero: ");
                int num = scanner.nextInt();
                if (num % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            }

            private static void calcularFactorial(Scanner scanner) {
                System.out.print("Ingresa un número: ");
                int n = scanner.nextInt();
                int factorial = 1;
                int i = 1;
                while (i <= n) {
                    factorial *= i;
                    i++;
                }
                System.out.println("El factorial de " + n + " es: " + factorial);
            }

            private static void mostrarImparesWhile(Scanner scanner) {
                System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
                int limite = scanner.nextInt();
                int num = 1;
                while (num <= limite) {
                    if (num % 2 != 0) {
                        System.out.print(num + " ");
                    }
                    num++;
                }
            }
            private static void mostrarImparesFor(Scanner scanner){
                System.out.print("Ingresa un número mayor a 10 y menor que 30: ");
                int limite = scanner.nextInt();
                for (int j = 1; j <= limite; j++) {
                    if (j % 2 != 0) {
                        System.out.print(j + " ");
                    }
                }
            }
            public static void mostrarDiasSemana(Scanner scanner){
                System.out.print("Ingresa un número del 1 al 5 para mostrar el dia correspondiente: ");
                int dia = scanner.nextInt();

                switch (dia) {
                    case 1:
                        System.out.println("Lunes");
                        break;
                    case 2:
                        System.out.println("Martes");
                        break;
                    case 3:
                        System.out.println("Miércoles");
                        break;
                    case 4:
                        System.out.println("Jueves");
                    case 5:
                        System.out.println("Viernes");

                    default:
                        System.out.println("No es un dia valido, elija un numero entre el 1 y el 5.");
                }
        }
        }
