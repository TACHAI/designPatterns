package iterator;

/**
 * 具体电视机类（创维）
 * Create by tachai on 2020-05-26 20:38
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class SkyworthTelevision implements Television {

    private Object[] obj={"CCTV-1","CCTV-2","CCTV-3"};

    @Override
    public TVIterator createIterator() {
        return new SkyworthIterator();
    }

    private class SkyworthIterator implements TVIterator{

        private int currentIndex=0;
        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
            if(currentIndex<obj.length){
                currentIndex++;
            }        }

        @Override
        public void previous() {
            if(currentIndex>0){
                currentIndex--;
            }
        }

        @Override
        public boolean isLast() {
            return currentIndex==obj.length;
        }

        @Override
        public Object currentChannel() {
            return obj[currentIndex];
        }

        @Override
        public boolean isFirst() {
            return currentIndex==0;
        }
    }
}
