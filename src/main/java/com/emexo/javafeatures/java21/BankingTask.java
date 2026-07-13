package com.emexo.javafeatures.java21;

import java.util.concurrent.Callable;

import static com.emexo.javafeatures.java21.Bank.*;

public class BankingTask implements Callable<Object> {

        private final String taskType;
        private final int customerId;

        BankingTask(String taskType, int customerId) {
            this.taskType = taskType;
            this.customerId = customerId;
        }

        @Override
        public Object call() throws Exception {

            return switch (taskType) {

                case "VALIDATE" ->
                        validateCustomer(customerId);

                case "BALANCE" ->
                        fetchBalance(customerId);

                case "TRANSACTIONS" ->
                        fetchTransactions(customerId);

                case "FRAUD" ->
                        fraudCheck(customerId);

                case "NOTIFICATION" ->
                        sendNotification(customerId);

                default ->
                        throw new IllegalArgumentException(
                                "Invalid Task Type"
                        );
            };
        }
    }

