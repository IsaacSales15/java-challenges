package temp_transform;

public class Transform {

    int type, temp;

    public Transform(int type, int temp){
        this.temp = temp;
        this.type = type;
    }

    public void getResult() {
        switch (type) {
            case 1:
                System.out.println("The value is: " + ((temp * 1.8) + 32));
                break;
            case 2:
                System.out.println("The value is: " + (temp - 273));
                break;
            default:
                throw new RuntimeException("Valor Inválido");
        }
    }
}
