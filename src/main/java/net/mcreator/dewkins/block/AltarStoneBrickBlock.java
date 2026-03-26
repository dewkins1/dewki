
package net.mcreator.dewkins.block;

public class AltarStoneBrickBlock extends Block {
	public AltarStoneBrickBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(-1, 3600000).lightLevel(s -> 1).noCollission().pushReaction(PushReaction.IGNORE));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}
}
