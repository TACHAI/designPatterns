package iterator;

/**
 * 抽象迭代器类
 * Create by tachai on 2020-05-26 20:35
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public interface TVIterator {
    void setChannel(int i);
    void next();
    void previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();
}
