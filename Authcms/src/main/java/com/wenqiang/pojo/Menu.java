package com.wenqiang.pojo;

import java.io.Serializable;
import java.util.List;


public class Menu  implements Serializable {
    private Integer menuId;

    private String menuName;

    private String menuUrl;

    private String parentId;

    private String menuOrder;

    private String menuIcon;

    private String menuType;

    private Integer menuState;
    
    private String target;
    public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public List<Menu> getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(List<Menu> subMenu) {
		this.subMenu = subMenu;
	}

	private List<Menu> subMenu;
    
    private boolean hasMenu = false;
    public boolean isHasMenu() {
		return hasMenu;
	}

	public void setHasMenu(boolean hasMenu) {
		this.hasMenu = hasMenu;
	}

	public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public Integer getMenuState() {
        return menuState;
    }

    public void setMenuState(Integer menuState) {
        this.menuState = menuState;
    }
}