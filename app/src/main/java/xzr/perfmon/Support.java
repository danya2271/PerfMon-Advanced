package xzr.perfmon;

class Support {
    static boolean support_cpufreq;
    static boolean support_cpuload;
    static boolean support_adrenofreq;
    static boolean support_mincpubw;
    static boolean support_l3bw;
    static boolean support_cpubw;
    static boolean support_m4m;
    static boolean support_temp;
    static boolean support_mem;
    static boolean support_current;
    static boolean support_gpubw;
    static boolean support_llcbw;
    static boolean support_fps;

    static final int UNSUPPORTED = -1;

    static int CheckSupport() {
        int linen = 0;

        if (JniTools.getCpuFreq(0) != UNSUPPORTED) {
            linen = linen + RefreshingDateThread.cpunum;
            support_cpufreq = true;
        } else support_cpufreq = false;

        support_cpuload = JniTools.checkCpuLoad();

        if (JniTools.getAdrenoFreq() != UNSUPPORTED) {
            linen++;
            support_adrenofreq = true;
        } else support_adrenofreq = false;

        if (JniTools.getL3bw() != UNSUPPORTED) {
            linen++;
            support_l3bw = true;
        } else support_l3bw = false;

        if (JniTools.getMinCpuBw() != UNSUPPORTED) {
            linen++;
            support_mincpubw = true;
        } else support_mincpubw = false;

        if (JniTools.getCpuBw() != UNSUPPORTED) {
            linen++;
            support_cpubw = true;
        } else support_cpubw = false;

        if (JniTools.getM4m() != UNSUPPORTED) {
            linen++;
            support_m4m = true;
        } else support_m4m = false;

        if (JniTools.getMaxTemp() != UNSUPPORTED) {
            linen++;
            support_temp = true;
        } else support_temp = false;

        if (JniTools.getMemUsage() != UNSUPPORTED) {
            linen++;
            support_mem = true;
        } else support_mem = false;

        if (JniTools.getCurrent() != UNSUPPORTED) {
            linen++;
            support_current = true;
        } else support_current = false;

        if (JniTools.getGpuBw() != UNSUPPORTED) {
            linen++;
            support_gpubw = true;
        } else support_gpubw = false;

        if (JniTools.getLlccBw() != UNSUPPORTED) {
            linen++;
            support_llcbw = true;
        } else support_llcbw = false;

        if (!JniTools.getFps().equals("")) {
            linen++;
            support_fps = true;
        } else support_fps = false;

        return linen;
    }

}
