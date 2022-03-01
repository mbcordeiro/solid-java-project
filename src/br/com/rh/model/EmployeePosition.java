package br.com.rh.model;

public enum EmployeePosition {

    ASSISTANT {
        @Override
        public EmployeePosition getNextPosition() {
            return ANALYST;
        }
    },
    ANALYST {
        @Override
        public EmployeePosition getNextPosition() {
            return SPECIALIST;
        }
    },
    SPECIALIST {
        @Override
        public EmployeePosition getNextPosition() {
            return null;
        }
    },
    MANAGER {
        @Override
        public EmployeePosition getNextPosition() {
            return MANAGER;
        }
    };

    public abstract EmployeePosition getNextPosition();
}
