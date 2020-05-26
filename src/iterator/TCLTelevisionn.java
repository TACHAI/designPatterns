package iterator;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Create by tachai on 2020-05-26 20:44
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class TCLTelevisionn implements Television {

    private Object[] obj ={"湖南卫视","北京卫视","上海卫视","浙江卫视"};

    @Override
    public TVIterator createIterator() {
        return new TCLIterator();
    }

    class TCLIterator implements TVIterator{

        private int currentIndex=0;

        @Override
        public void setChannel(int i) {
            currentIndex=i;
        }

        @Override
        public void next() {
            if(currentIndex<obj.length){
                currentIndex++;
            }
        }

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
