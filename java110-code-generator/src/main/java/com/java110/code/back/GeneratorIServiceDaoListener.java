package com.java110.code.back;

public class GeneratorIServiceDaoListener extends BaseGenerator {





    /**
     * 生成代码
     * @param data
     */
    public void generator(Data data){
        StringBuffer sb = readFile(this.getClass().getResource("/template/IServiceDao.txt").getFile());
        String fileContext = sb.toString();
        fileContext = fileContext.replace("store",toLowerCaseFirstOne(data.getName()))
                .replace("Store",toUpperCaseFirstOne(data.getName()))
                .replace("商户",data.getDesc());

        String writePath = this.getClass().getResource("/").getPath()
                + "out/back/dao/I"+toUpperCaseFirstOne(data.getName())+"ServiceDao.java";
        writeFile(writePath,
                fileContext);
    }
}
