package org.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import org.core.entity.ArticleReply;
import org.core.idao.ArticleReplyMapper;
import org.core.service.ReplyService;

@Service("articleReplyService")
public class ReplyServiceImpl implements ReplyService {

	@Resource
	private ArticleReplyMapper replyMapper;

	/**
	 * 查询key
	 */
	public ArticleReply getByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		ArticleReply reply = replyMapper.selectByPrimaryKey(id);
		return reply;
	}

	/**
	 * 查询 集合
	 */
	public List<ArticleReply> listReply(Integer articleId) {
		// TODO Auto-generated method stub
		List<ArticleReply> articleReplies = replyMapper.selectArticleReplies(articleId);
		return articleReplies;
	}

	/**
	 * 插入一条数据
	 */
	public int insertReplys(ArticleReply articleReply) {
		// TODO Auto-generated method stub
		int resId = replyMapper.insertReply(articleReply);
		return resId;
	}

}
