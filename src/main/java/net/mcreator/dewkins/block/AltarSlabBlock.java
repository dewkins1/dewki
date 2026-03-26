
package net.mcreator.dewkins.block;

public class AltarSlabBlock extends SlabBlock {
	public AltarSlabBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(-1, 3600000).noCollission().pushReaction(PushReaction.IGNORE));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
		return context.getItemInHand().getItem() != this.asItem();
	}
}
