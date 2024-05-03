   # 예외 처리
- Error는 프로그램 실행에 치명적인 영향을 주는 상황을 나타내므로 Error가 발생하면 프로그램은 종료 한다.
- Exception은 발생한 Error에 대한 적절한 처리를 하여 <b color="red">프로그램을 계속 실행</b> 할 수 있도록 한다.
## 예외 처리 방법
1. try ~ catch ~ finally
    - 예외의 원인이 현재 실행되는 블록에 있는 경우, 직접 예외를 처리하는 구문
   ```java
    try{
         // 예외가 발생할 가능성이 있는 코드
        } catch(Exception) {
         // 예외가 발생할 경우 실행할 코드
        } finally {
         // 예외와 상관없이 반드시 실행해야하는 코드
        }
2. throws
    - 예외의 원인이 그 메소드를 호출하는 호출자에게 있을 경우, 예외를 호출자에게 인계하는 구문
    - 예외가 발생하면 예외가 발생했음을 메소드 호출자에게 통지해줌(던지다=throw)
   ```java
    // 예외가 발생할 수 있는 메소드 선언부에 throws 절 사용
    public void methodname () throws Exception {
        // 예외가 발생할 가능성이 있는 코드
    }
## 예외의 종류 
#### runtime exception
예외처리 하지 않아도 컴파일 수행한다.<br>올바르게 설계되지 않고 구현된 프로그램에서 사용한다.
>- ArithmeticException
>- ClassCastException
>- IndexOutOfBoundsException
>- NullPointException (null값을 참조하는 경우발생하는 예외)
#### compile exception
반드시 예외 처리해주어야 컴파일이 수행한다.<br>사용자가 잘못된 값을 입력하면 예외가 발생한다.
>- IOException
>- SQLException
>- InterruptedException