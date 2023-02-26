package Review.IntroduceAssertion.MyCode;

public class SortSample {
    private final int[] _data;

    public SortSample(int[] data) {
        _data = new int[data.length];
        System.arraycopy(data, 0, _data, 0, _data.length);
    }

    public void sort() {
        for (int x = 0; x < _data.length - 1; x++) {
            int m = x;
            for (int y = x + 1; y < _data.length; y++) {
                if (_data[m] > _data[y]) {
                    m = y;
                }
            }
            //여기서 _data[m]은 _data[x] ~ _data[_data.length - 1]의 최소값
            assert isMin(m, x, _data.length - 1);

            int v = _data[m];
            _data[m] = _data[x];
            _data[x] = v;
            //여기서 _data[0] ~ _data[x + 1]은 이미 정렬되어 있어야 함
            assert isSorted(0, x + 1);
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < _data.length; i++){
            builder.append(_data[i]);
            builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

    //최소값인지 확인하는 로직
    private boolean isMin(int pos, int start, int end) {
        for (int i = start; i < end; i++) {
            if (_data[pos] > _data[i]) return false;
        }
        return true;
    }

    //정렬되어 있는지 확인하는 로직
    private boolean isSorted(int start, int end) {
        for(int i = start; i < end; i++) {
            if(_data[i] > _data[i+1]) return false;
        }
        return true;
    }
}
