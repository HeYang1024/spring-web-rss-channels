package pl.dmichalski.rss.core.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmichalski.rss.core.entity.RssFeedEntity;
import pl.dmichalski.rss.core.entity.RssFeedEntryEntity;

import java.util.List;

/**
 * Author: Daniel
 */
public interface ItemRepository extends JpaRepository<RssFeedEntryEntity, Long> {

    List<RssFeedEntryEntity> findByRssFeedEntity(RssFeedEntity rssFeedEntity, Pageable pageable);

    RssFeedEntryEntity findByRssFeedEntityAndLink(RssFeedEntity rssFeedEntity, String link);

}
