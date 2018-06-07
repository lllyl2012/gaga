package top.lllyl2012.bean;

public class IndexRank {
    private Integer id;

    private Integer animationId;

    private Integer category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAnimationId() {
        return animationId;
    }

    public void setAnimationId(Integer animationId) {
        this.animationId = animationId;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
    
    private Animation animation;

	public Animation getAnimation() {
		return animation;
	}

	public void setAnimation(Animation animation) {
		this.animation = animation;
	}
    
}