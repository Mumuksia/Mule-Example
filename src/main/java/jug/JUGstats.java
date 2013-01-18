package jug;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: y.zavada
 * Date: 17.01.13
 * Time: 16:58
 */
@XmlRootElement(name = "JUG")
@XmlAccessorType(XmlAccessType.FIELD)
public class JUGstats {

    @XmlElement(name = "NumberOf")
    private int count;

    @XmlElement(name = "Victim")
    private String presenter;

    @XmlElement(name = "Theme")
    private String topic;

    @Override
    public String toString() {
        return "JUGstats{" +
                "count=" + count +
                ", presenter='" + presenter + '\'' +
                ", topic='" + topic + '\'' +
                '}';
    }

    public JUGstats() {
    }

    public JUGstats(int count, String presenter, String topic) {
        this.count = count;
        this.presenter = presenter;
        this.topic = topic;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
