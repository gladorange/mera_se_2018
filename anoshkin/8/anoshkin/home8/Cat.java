package anoshkin.home8;


import anoshkin.home9.AnimalHeader;

@AnimalHeader(typeName = "CAT",
              description = "Кошка бывает кусачей только от жизни кошачьей",
              parameterField = "длинаУсов")
public class Cat extends Animal {
    private Integer length = 0;

    public Cat(String name, int length){
        super(name);
        this.length = length;
    }

    @Override
    public void sayHello() {
        if ((length > 5)) {
            System.out.println("Мяу, я кошка с длинными усами");
        } else {
            System.out.println("Мяу");
        }
    }

    public Integer getLength(){
        return length;
    }

}
