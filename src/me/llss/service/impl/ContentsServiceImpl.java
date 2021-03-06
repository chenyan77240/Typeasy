package me.llss.service.impl;

import java.util.List;

import me.llss.dao.ContentsDAO;
import me.llss.dao.impl.ContentsDAOImpl;
import me.llss.service.ContentsService;
import me.llss.vo.ContentsVO;

/**
 * ContentsService实现
 * 
 * @author Acris
 * @version 2.0 2013/19/17 11:49
 * 
 */
public class ContentsServiceImpl implements ContentsService {

	private ContentsDAO contentsDao = new ContentsDAOImpl();

	/**
	 * 发表文章
	 * 
	 * @param content
	 */
	public void add(ContentsVO content) {
		contentsDao.add(content);
	}

	/**
	 * 显示文章列表
	 * 
	 * @return
	 */
	public List<ContentsVO> list() {
		List<ContentsVO> cs = contentsDao.list();
		return cs;
	}

	/**
	 * 根据id删除文章
	 * 
	 * @param id
	 */
	public void del(int id) {
		contentsDao.del(id);
	}

	/**
	 * 根据id修改文章
	 * 
	 * @param content
	 * @return
	 */
	public boolean edit(ContentsVO content) {
		ContentsVO c = contentsDao.find(content.getCid());
		if (c != null) {
			contentsDao.edit(content);
			return true;
		}
		return false;
	}

	/**
	 * 根据id查询文章
	 * 
	 * @param id
	 * @return
	 */
	public ContentsVO find(int id) {
		ContentsVO content = contentsDao.find(id);
		return content;
	}

	/**
	 * 更改评论数
	 * 
	 * @param cid
	 * @param o
	 */
	public void editCommentsNum(int cid, String o) {
		contentsDao.editCommentsNum(cid, o);
	}

	/**
	 * 搜索文章
	 * 
	 * @param keywords
	 * @return
	 */
	public List<ContentsVO> search(String keywords) {
		List<ContentsVO> cs = contentsDao.search(keywords);
		return cs;
	}
}
