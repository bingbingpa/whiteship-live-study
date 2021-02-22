package com.bingbingpa.week14;

import com.bingbingpa.week14.car.Sedan;
import com.bingbingpa.week14.car.Truck;
import com.bingbingpa.week14.car.Vehicle;

public class GenericBoundExample<T extends Vehicle> {
    private T vehicleType;

    public void setVehicleType(T vehicleType) {
        this.vehicleType = vehicleType;
    }

    public T getVehicleType() {
        return vehicleType;
    }

    public static void main(String[] args) {
        GenericBoundExample<Sedan> sedan = new GenericBoundExample<Sedan>();
        GenericBoundExample<Truck> truck = new GenericBoundExample<Truck>();
        // 상속 범위를 벗어났기 때문에 컴파일 에러 발생
//        GenericBoundExample<String> error = new GenericBoundExample<String>();

    }
}
