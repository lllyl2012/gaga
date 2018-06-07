package top.lllyl2012.bean;

public class IndexLunbo {
    private Integer id;

    private String imagePath;

    private Integer animationId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath == null ? null : imagePath.trim();
    }

    public Integer getAnimationId() {
        return animationId;
    }

    public void setAnimationId(Integer animationId) {
        this.animationId = animationId;
    }
    
    /**
     * 对应的电影
     */
    private Animation animation;

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
    
}