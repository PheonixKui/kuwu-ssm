-- 创建图书表
CREATE TABLE `student` (
  `studentId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
  `studentName` varchar(100) NOT NULL COMMENT '学生名字',
  `studentSex` varchar (11) NOT NULL COMMENT '学生性别',
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='学生表';

-- 初始化图书数据
INSERT INTO `student` (`studentId`, `studentName`, `studentSex`)
VALUES
	(1000, '小明', '男'),
  (1001, '小球', '女'),
  (1002, '小何', '男'),
  (1003, '小小', '女'),
  (1004, '小大', '男');

