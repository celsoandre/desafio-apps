package celso.com.br.globo.operation;

public class OperarionResult<T> {

    public static final int NO_ERROR = -1;
    private int error = NO_ERROR;
    private String errorMessage;
    private T anonnymousType;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getResult() {
        return anonnymousType;
    }

    public void setResult(T anonnymousType) {
        this.anonnymousType = anonnymousType;
    }
}
