package karl.codes.minecraft.world;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.IRenderHandler;

import java.util.Arrays;

/**
 * Created by karl on 11/9/15.
 */
public class WorldProviderCircuits extends WorldProvider {
    protected WorldProviderCircuits() {
    }

    public String getDimensionName() {
        return "InnerSpace";
    }

    public String getInternalNameSuffix() {
        return "_circuits";
    }

    @Override
    protected void generateLightBrightnessTable() {
        Arrays.fill(lightBrightnessTable, 1f);
    }

    @Override
    protected void registerWorldChunkManager() {
        // TODO WorldChunkManager homogenous
        this.worldChunkMgr = null;
    }

    @Override
    public IChunkProvider createChunkGenerator() {
        return super.createChunkGenerator();
    }

    @Override
    public boolean canCoordinateBeSpawn(int x, int z) {
        return super.canCoordinateBeSpawn(x, z);
    }

    @Override
    public float calculateCelestialAngle(long p_76563_1_, float f2) {
        return super.calculateCelestialAngle(p_76563_1_, f2);
    }

    @Override
    public int getMoonPhase(long p_76559_1_) {
        return super.getMoonPhase(p_76559_1_);
    }

    @Override
    public boolean isSurfaceWorld() {
        return super.isSurfaceWorld();
    }

    @Override
    public float[] calcSunriseSunsetColors(float celestialAngle, float partialTicks) {
        return super.calcSunriseSunsetColors(celestialAngle, partialTicks);
    }

    @Override
    public Vec3 getFogColor(float p_76562_1_, float p_76562_2_) {
        return super.getFogColor(p_76562_1_, p_76562_2_);
    }

    @Override
    public boolean canRespawnHere() {
        return super.canRespawnHere();
    }

    @Override
    public float getCloudHeight() {
        return super.getCloudHeight();
    }

    @Override
    public boolean isSkyColored() {
        return super.isSkyColored();
    }

    @Override
    public BlockPos getSpawnCoordinate() {
        return super.getSpawnCoordinate();
    }

    @Override
    public int getAverageGroundLevel() {
        return super.getAverageGroundLevel();
    }

    @Override
    public double getVoidFogYFactor() {
        return super.getVoidFogYFactor();
    }

    @Override
    public boolean doesXZShowFog(int x, int z) {
        return super.doesXZShowFog(x, z);
    }

    @Override
    public WorldChunkManager getWorldChunkManager() {
        return super.getWorldChunkManager();
    }

    @Override
    public boolean doesWaterVaporize() {
        return super.doesWaterVaporize();
    }

    @Override
    public boolean getHasNoSky() {
        return super.getHasNoSky();
    }

    @Override
    public float[] getLightBrightnessTable() {
        return super.getLightBrightnessTable();
    }

    @Override
    public int getDimensionId() {
        return super.getDimensionId();
    }

    @Override
    public WorldBorder getWorldBorder() {
        return super.getWorldBorder();
    }

    @Override
    public void setDimension(int dim) {
        super.setDimension(dim);
    }

    @Override
    public String getSaveFolder() {
        return super.getSaveFolder();
    }

    @Override
    public String getWelcomeMessage() {
        return super.getWelcomeMessage();
    }

    @Override
    public String getDepartMessage() {
        return super.getDepartMessage();
    }

    @Override
    public double getMovementFactor() {
        return super.getMovementFactor();
    }

    @Override
    public IRenderHandler getSkyRenderer() {
        return super.getSkyRenderer();
    }

    @Override
    public void setSkyRenderer(IRenderHandler skyRenderer) {
        super.setSkyRenderer(skyRenderer);
    }

    @Override
    public IRenderHandler getCloudRenderer() {
        return super.getCloudRenderer();
    }

    @Override
    public void setCloudRenderer(IRenderHandler renderer) {
        super.setCloudRenderer(renderer);
    }

    @Override
    public IRenderHandler getWeatherRenderer() {
        return super.getWeatherRenderer();
    }

    @Override
    public void setWeatherRenderer(IRenderHandler renderer) {
        super.setWeatherRenderer(renderer);
    }

    @Override
    public BlockPos getRandomizedSpawnPoint() {
        return super.getRandomizedSpawnPoint();
    }

    @Override
    public boolean shouldMapSpin(String entity, double x, double p_shouldMapSpin_4_, double y) {
        return super.shouldMapSpin(entity, x, p_shouldMapSpin_4_, y);
    }

    @Override
    public int getRespawnDimension(EntityPlayerMP player) {
        return super.getRespawnDimension(player);
    }

    @Override
    public BiomeGenBase getBiomeGenForCoords(BlockPos pos) {
        return super.getBiomeGenForCoords(pos);
    }

    @Override
    public boolean isDaytime() {
        return super.isDaytime();
    }

    @Override
    public float getSunBrightnessFactor(float par1) {
        return super.getSunBrightnessFactor(par1);
    }

    @Override
    public float getCurrentMoonPhaseFactor() {
        return super.getCurrentMoonPhaseFactor();
    }

    @Override
    public Vec3 getSkyColor(Entity cameraEntity, float partialTicks) {
        return super.getSkyColor(cameraEntity, partialTicks);
    }

    @Override
    public Vec3 drawClouds(float partialTicks) {
        return super.drawClouds(partialTicks);
    }

    @Override
    public float getSunBrightness(float par1) {
        return super.getSunBrightness(par1);
    }

    @Override
    public float getStarBrightness(float par1) {
        return super.getStarBrightness(par1);
    }

    @Override
    public void setAllowedSpawnTypes(boolean allowHostile, boolean allowPeaceful) {
        super.setAllowedSpawnTypes(allowHostile, allowPeaceful);
    }

    @Override
    public void calculateInitialWeather() {
        super.calculateInitialWeather();
    }

    @Override
    public void updateWeather() {
        super.updateWeather();
    }

    @Override
    public boolean canBlockFreeze(BlockPos pos, boolean byWater) {
        return super.canBlockFreeze(pos, byWater);
    }

    @Override
    public boolean canSnowAt(BlockPos pos, boolean checkLight) {
        return super.canSnowAt(pos, checkLight);
    }

    @Override
    public void setWorldTime(long time) {
        super.setWorldTime(time);
    }

    @Override
    public long getSeed() {
        return super.getSeed();
    }

    @Override
    public long getWorldTime() {
        return super.getWorldTime();
    }

    @Override
    public BlockPos getSpawnPoint() {
        return super.getSpawnPoint();
    }

    @Override
    public void setSpawnPoint(BlockPos pos) {
        super.setSpawnPoint(pos);
    }

    @Override
    public boolean canMineBlock(EntityPlayer player, BlockPos pos) {
        return super.canMineBlock(player, pos);
    }

    @Override
    public boolean isBlockHighHumidity(BlockPos pos) {
        return super.isBlockHighHumidity(pos);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    public int getActualHeight() {
        return super.getActualHeight();
    }

    @Override
    public double getHorizon() {
        return super.getHorizon();
    }

    @Override
    public void resetRainAndThunder() {
        super.resetRainAndThunder();
    }

    @Override
    public boolean canDoLightning(Chunk chunk) {
        return super.canDoLightning(chunk);
    }

    @Override
    public boolean canDoRainSnowIce(Chunk chunk) {
        return super.canDoRainSnowIce(chunk);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
