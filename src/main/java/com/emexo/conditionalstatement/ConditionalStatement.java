package com.emexo.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConditionalStatement {

    static void main() {
        ConditionalStatement statement = new ConditionalStatement();
        String res = statement.orderFood1("dosa1");
        log.info(res);
    }


    public String orderFood(String food ) { // switch statement
        String response;
        switch (food){
            case "idly":
                response = "ordered idly";
                break;
            case "dosa":
                response = "ordered dosa";
                break;
            default:
                response = "Food not available at this time";
                break;
        }

        return response;
    }

    public String orderFood1(String food){
        return switch (food){ // switch expression from 14
            case "idly"-> "ordered idly";
            case "dosa" -> {
               String val1 = "Ordered food";
               String val2 = " dosa";
               String res = val1.concat(val2);
               yield res;
            }
            default -> "food not availble";
        };
    }
}
